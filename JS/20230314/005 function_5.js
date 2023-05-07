const fruits = [];
const callback = function () {
    const input = document.querySelector("#input");
    fruits.push(input.value);
    document.querySelector("#fruits").innerHTML = fruits;
    document.querySelector("#fruits").style.fontSize = "30px";
    console.log(fruits);
    input.value = "";
};




