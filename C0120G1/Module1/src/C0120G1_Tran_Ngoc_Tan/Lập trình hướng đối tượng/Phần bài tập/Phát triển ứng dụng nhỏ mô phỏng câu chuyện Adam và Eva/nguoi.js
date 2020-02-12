var Human = function (name, age, weight) {
    this.name = name;
    this.weight = weight;
    this.age = age;
    // this.gender=gender;

    // this.setName=function (name) {
    //     this.name=name;
    // };
    this.getName = function () {
        return this.name;
    };

    this.setGender = function (gender) {
        this.gender = gender;
    };
    this.getGender = function () {
        return this.gender;
    };
    this.setAge = function (age) {
        this.age = age;
    };
    this.getAge = function () {
        return this.age;
    };
    this.setWeight = function (weight) {
        this.weight = weight;
    };
    this.getWeight = function () {
        return this.weight;
    };

    this.checkGender = function () {
        if (this.gender == true) {
            return "Giới tính Nam";
        } else {
            return "Giới tính Nữ";
        }
    }
    this.isMale = function () {
        return this.gender = true;
    };
    this.isFemale = function () {
        return this.gender = false;
    };
    this.eatTao = function () {
        if (tao.getWeight() > 0) {
            this.weight++;
            tao.weight--;
        } else {
            return;
        }

    };
    this.say = function (noiDung) {
        return noiDung;
    };
    this.kiemTraTao = function () {
        return tao.getWeight();
    }

}
var Tao = function (weight) {
    this.weight = weight;

    this.getWeight = function () {
        return this.weight;
    };

    this.decrease = function () {
        this.weight--;
    };
    this.isEmpty = function () {
        if (this.getWeight() >0) {
            return true;
        } else {
            return false;
        }
    }

}