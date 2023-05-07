const input = document.querySelector("#input");
const div = document.querySelector("div");
const callback = function () {
    const pTag = document.createElement("p"); //<p></p>
    // pTag.style.display = "inline-block";
    pTag.innerHTML = input.value;
    console.log(pTag); 
    div.appendChild(pTag); // append 끝에 추가
    input.value = "";
};