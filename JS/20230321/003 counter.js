const value = document.querySelector("#value");
const btnIncrease = document.querySelector(".increase");
const btnDecrease = document.querySelector(".decrease");
const btnReset = document.querySelector(".reset");

let num = parseInt(value.innerHTML);
console.log(num);

const numColor = function () {
  if (num>0) {
    value.style.color = "green";
  } else if (num<0) {
    value.style.color = "red";
  } else {
    value.style.color = "black";
  }
}

const increase = function () {
  num = num + 1;
  value.innerHTML = num;
  numColor()
};
const decrease = function () {
  num = num - 1;
  value.innerHTML = num;
  numColor()
};
const reset = function () {
  num = 0
  value.innerHTML = num;
  numColor()
};


btnIncrease.addEventListener("click", increase);
btnDecrease.addEventListener("click", decrease);
btnReset.addEventListener("click", reset);