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
	
}

