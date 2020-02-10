var Employee=function () {
    this.setName=function (name) {
        this.name=name;
    };
    this.getName=function () {
        return this.name;
    };
    this.setBirthday=function (birthday) {
        this.birthday=birthday;
    };
    this.getBirthday=function () {
        return this.birthday;
    };
    this.setIdCard=function (idCard) {
        this.idCard=idCard;
    };
    this.getIdCard=function () {
        return this.idCard;
    };
    this.setPhone=function (phone) {
        this.phone=phone;
    };
    this.getPhone=function () {
        return this.phone;
    };
    this.setEmail=function (email) {
        this.email=email;
    };
    this.getEmail=function () {
        return this.email;
    };
    this.setLevel=function (level) {
        this.level=level;
    };
    this.getLevel=function () {
        return this.level;
    };
    this.setLocal=function (local) {
        this.local=local;
    };
    this.getLocal=function () {
        return this.local;
    };
    this.setSalary=function (salary) {
        this.salary=salary;
    };
    this.getSalary=function () {
        return this.salary;
    };
    this.totalPays = function () {
        let moneyPerDays=0;
        if(this.getTypeService()=== "Villa"){
            moneyPerDays=500;
        }else if(this.getTypeService()=== "House"){
            moneyPerDays=300;
        }else{
            moneyPerDays=300;
        }
        return moneyPerDays*parseFloat(this.getRentDays())*(1-parseFloat(this.getDiscount())/100);
    };
    this.totalSalary=function () {
        let salary=0;
        if(this.getLocal()=="Manager"){
            salary=this.getSalary()+500;
        }else if(this.getLocal()=="Sale"){
            salary=this.getSalary()+300;
        }else if(this.getLocal()=="Marketing"){
            salary=this.getSalary()+200;
        }
    };
}