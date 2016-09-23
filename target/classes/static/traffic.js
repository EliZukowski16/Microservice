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
			tableRow += '<td>' + dateOfStop + '</td>';
			tableRow += '<td>' + timeOfStop + '</td>';
			tableRow += '<td>' + latitude + '</td>';
			tableRow += '<td>' + longitude + '</td>';
			tableRow += '<td>' + location + '</td>';
			tableRow += '<td>' + vehicleType + '</td>';
			tableRow += '<td>' + vehicleMake + '</td>';
			tableRow += '<td>' + vehicleModel + '</td>';
			tableRow += '<td>' + vehicleYear + '</td>';
			tableRow += '<td>' + vehicleColor + '</td>';
			tableRow += '</tr>';
			
		$("#stopBody").append(tableRow);
	}
	
	$("#trafficStops").removeClass("hidden");
}

