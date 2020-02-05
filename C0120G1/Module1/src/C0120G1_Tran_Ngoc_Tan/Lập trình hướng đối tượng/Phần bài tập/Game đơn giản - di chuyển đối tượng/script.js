function Hero(image,top,left,size) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;

    this.getHeroElement = function () {
        return '<img width="' + this.size + '"' +
            ' height="' + this.size + '"' +
            ' src="' + this.image + '"' +
            ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
    }

    this.moveRight = function () {
        this.left += 20;
        console.log('ok: ' + this.left);
    }
    this.moveBottom = function () {
        this.top += 20;
        console.log('ok: ' + this.top);
    }
    this.moveLeftNguoc = function () {
        this.left -= 20;
        console.log('ok: ' + this.left);
    }
    this.moveTopNguoc = function () {
        this.top -= 20;
        console.log('ok: ' + this.top);
    }
}
var hero = new Hero('pikachu.png', 20, 30, 200);
var hero1 = new Hero('pikachu.png', 20, 200, 200);
var hero2 = new Hero('pikachu.png', 20, 200, 200);

function start(){
    if(hero.left < window.innerWidth - hero.size && hero.top===20){
        console.log(hero.left);
        hero.moveRight();
    }
    else if(hero.top < window.innerHeight - hero.size && hero.left>window.innerWidth - hero.size){
        hero.moveBottom();
    }else if(hero.left > window.innerWidth - hero.size){
        hero.moveLeftNguoc();
    }
    else if(hero.left > 20){
        hero.moveLeftNguoc();
    }else {
        hero.moveTopNguoc();
    }


    document.getElementById('game').innerHTML = hero.getHeroElement();
    // document.getElementById('game1').innerHTML = hero1.getHeroElement();
    setTimeout(start, 50);
}

start();
function start1(){
    if(hero1.left < window.innerWidth - hero1.size && hero1.top===20){
        console.log(hero1.left);
        hero1.moveRight();
    }
    else if(hero1.top < window.innerHeight - hero1.size && hero1.left>window.innerWidth - hero1.size){
        hero1.moveBottom();
    }else if(hero1.left > window.innerWidth - hero1.size){
        hero1.moveLeftNguoc();
    }
    else if(hero1.left > 20){
        hero1.moveLeftNguoc();
    }else {
        hero1.moveTopNguoc();
    }


    // document.getElementById('game').innerHTML = hero.getHeroElement();
    document.getElementById('game1').innerHTML = hero1.getHeroElement();
    setTimeout(start1, 70);
}

start1();
function start2(){
    if(hero2.left < window.innerWidth - hero2.size && hero2.top===20){
        console.log(hero2.left);
        hero2.moveRight();
    }
    else if(hero2.top < window.innerHeight - hero2.size && hero2.left>window.innerWidth - hero2.size){
        hero2.moveBottom();
    }else if(hero2.left > window.innerWidth - hero2.size){
        hero2.moveLeftNguoc();
    }
    else if(hero2.left > 20){
        hero2.moveLeftNguoc();
    }else {
        hero2.moveTopNguoc();
    }


    document.getElementById('game2').innerHTML = hero2.getHeroElement();
    // document.getElementById('game1').innerHTML = hero1.getHeroElement();
    setTimeout(start2, 400);
}

start2();