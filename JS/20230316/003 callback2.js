const fruits = [];
const callback = function () {
    const input = document.querySelector("#input");
    fruits.push(input.value);
    console.log(fruits);
    const tag = document.querySelector("div");
    display(input.value, tag);
    input.value = "";
};

const display = function (inputValue, tag) {
    const pTag = document.createElement("p");
    pTag.innerHTML = inputValue;
    tag.appendChild(pTag);
};




