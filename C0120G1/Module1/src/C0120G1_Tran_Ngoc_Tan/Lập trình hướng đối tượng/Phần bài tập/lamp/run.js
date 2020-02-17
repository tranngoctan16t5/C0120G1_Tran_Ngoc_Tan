var congtat=new SwitchButton();
var bongDen=new ElectricLamp();
function batTatBongDen(status) {
     switch (status) {
         case "bat":
             document.getElementById("MyLamp").src="bat.jpg";
             break;
         case "tat":
             document.getElementById("MyLamp").src="tat.jpg";
     }
}
