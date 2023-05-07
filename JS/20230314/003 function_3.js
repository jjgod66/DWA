const text = prompt("텍스트를 입력해주세요");
const div = document.querySelector("#text");
div.innerHTML = text;

const callback = function () {
    div.style.backgroundColor = "#654321";
};