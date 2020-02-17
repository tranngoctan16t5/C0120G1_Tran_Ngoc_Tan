var SwitchButton = function (status) {
    this.setStatus = function (status) {
        this.status = status;
    };
    this.getStatus = function () {
        return this.status;
    };
    this.switchOff = function () {
        return this.status = true;
    };
    this.switchTurn = function () {
        return this.status = false;
    };
    this.connectToLamp = function () {
      if(this.SwitchButton==true){
          this.ElectricLamp=true
      }else{
          this.ElectricLamp=false;
      }
    }
}
var ElectricLamp = function (status) {
    this.status=status;
    this.turnOff = function () {
        return this.status = true;
    };
    this.turnOn = function () {
        return this.status = false;
    };
}