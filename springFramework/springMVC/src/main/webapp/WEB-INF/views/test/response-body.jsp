<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<h1>@ResponseBody</h1>

<button type="button" name="httpResponse">HttpServletResponse</button>
<button type="button" name="responseBody">@ResponseBody</button>



<script>
async function ajax(e){
	
	const url = 'api.' + e.toElement.name;

	const {xhr} = await import('/js/xhr.js');
	
	xhr(url, null, server => {
		
		const data = JSON.parse(server);
		
		console.log(data);
	    
	});
	
}

const btn = document.querySelectorAll('button');

btn.forEach( e => e.addEventListener('click', ajax) );
</script>