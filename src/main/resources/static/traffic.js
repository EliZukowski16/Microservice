/**
 * 
 */

$(document).ready(function() {
	
	var date = $("#dateSelect");
	$("#submitDate").click(function() {
		console.log(date.val());
		var year = date.val().slice(0,4);
		console.log(year);
		var month = date.val().slice(5,7);
		console.log(month);
		var day = date.val().slice(8);
		console.log(day);
		
		var restCall = "./stops/" + year + "/" + month + "/" + day; 
		
		$.getJSON(restCall, parseStops);
	});
})

function parseStops(stops) {
	
	$("tr").remove(".stopRow");
	
	for(let i = 0 ; i < stops.length; i++) {
		let dateOfStop = stops[i].date_of_stop;
		let timeOfStop = stops[i].time_of_stop;
		let latitude = stops[i].latitude;
		let longitude = stops[i].longitude;
		let location = stops[i].location;
		let vehicleType = stops[i].vehicle_type;
		let vehicleMake = stops[i].make;
		let vehicleModel = stops[i].model;
		let vehicleYear = stops[i].year;
		let vehicleColor = stops[i].color;
		
		var tableRow = '<tr class="stopRow">';
			tableRow += '<th>' + dateOfStop + '</th>';
			tableRow += '<th>' + timeOfStop + '</th>';
			tableRow += '<th>' + latitude + '</th>';
			tableRow += '<th>' + longitude + '</th>';
			tableRow += '<th>' + location + '</th>';
			tableRow += '<th>' + vehicleType + '</th>';
			tableRow += '<th>' + vehicleMake + '</th>';
			tableRow += '<th>' + vehicleModel + '</th>';
			tableRow += '<th>' + vehicleYear + '</th>';
			tableRow += '<th>' + vehicleColor + '</th>';
			tableRow += '</tr>';
			
		$("#trafficStopTable").append(tableRow);
	}
	
	$("#trafficStops").removeClass("hidden");
}

