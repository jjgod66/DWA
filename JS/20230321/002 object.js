// 객체
const person = {
  firstName : "Gildong",
  lastName : "Hong",
  age : 30,
  display : function () {
    return person.lastName + ", " + person.firstName + ", " + person.age + " "; 
  },
};

// document.write(person.age); // body태그에 쓰는것과 같음
// document.write(person); // 객체는 이런 방식으로 화면에 보여주지 않는다.
// document.write(person.display());

const tom = person;
tom.age = 25;
tom.firstName = "Tom";
tom.lastName = "Smith";
// 위와 같이 만들면 참조복사가 일어나므로 원본인 person의 값이 바뀜
// document.write(tom.display());
// document.write(person.display());


// 생성자(constructor) 만드는 법 - 첫글자는 대문자
function Person(first, last, age) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.display = function () {
    return this.lastName + ", " + this.firstName + ", " + this.age + " "; 
  }
}

const steve = new Person("Steve", "Kim", 45);
console.log(steve.display());

const tim  = new Person("Tim", "Allen", 23);
console.log(tim.display());
