<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<script src='http://code.jquery.com/jquery-latest.js'></script> 
<link href='/fullcalendar/main.css' rel='stylesheet' />
<script src='/fullcalendar/main.js'></script>
</head>
<body style="padding: 30px;">
	<!-- calendar 태그 -->
	<div id='calendar-container'>
		<div id='calendar'></div>
	</div>
<script>
$(document).ready(function(){
	$.ajax({
		url: '/calendar',
		type: 'GET',
		success: function(res){
			var list = res;
			console.log(list);			
			
 			var calendarEl = document.getElementById('calendar');
			
			var events = list.map(function(item) {
				return {
					title : item.roonNo,
					start : item.startDate,
					end : item.endDate
				}
			});
			
			var calendar = new FullCalendar.Calendar(calendarEl, {
				events : events,
				eventTimeFormat: { // like '14:30:00'
				    hour: '2-digit',
				    minute: '2-digit',
				    hour12: false
				  }
			});
			calendar.render();
		},
	})
});


</script>
</body>
</html>

