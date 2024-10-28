function showFunction(){
	var x=document.getElementsByClassName("para");
	for(var i=0;i<x.length;i++){
	x[i].style.color="darkcyan";
	x[i].style.fontSize="26px";
	x[i].style.fontFamily='Roboto';
	}
}
function hideFunction(){
	var x=document.getElementsByClassName("para");
	for(var i=0;i<x.length;i++){
	x[i].style.color="white";
	x[i].style.fontSize="28px";
	x[i].style.backgroundColor="darkcyan";
	x[i].style.fontFamily='Roboto';
	}
}
function q2(){
	var msg=document.getElementsByClassName("ip");
	var txt='';
	for(var i=0;i<msg.length;i++){
		txt+=msg[i].value+ "<br><br>";
	}
	document.getElementById("display_msg").innerHTML=txt;
	return false;
}
function q3(){
	var x=document.getElementById("sel");
	x.remove(x.selectedIndex);
}
var h=document.getElementsByClassName("heading");
var dt=document.getElementsByClassName("disappeared");
for(let i=0;i<h.length;i++){
	h[i].onmouseover=function(){
		for(let j=0;j<dt.length;j++){
		dt[j].style.color='white';
		}
	}
	h[i].onmouseout=function(){
		for(let j=0;j<dt.length;j++){
		dt[j].style.color='white';
		}
	}
}

