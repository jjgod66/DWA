const fruits = ["apple", "orange", "banana", "pear", "pineapple"];

// for (i=0; i<fruits.length; i++) {
//     console.log(fruits[i]);
// }


// for (const fruit of fruits) {
//     console.log(fruit);
// }


fruits.forEach(function(fruit) {
    console.log(fruit);
})

fruits.push("포도");
console.dir(fruits);

//함수의 선언
const logging = function(log) {
    console.log(log);
}

//함수의 호출
const str = "함수의 호출";
logging(str);