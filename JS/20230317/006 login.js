// 1단계
const loginForm = document.querySelector("#loginForm");
const input = document.querySelector("input");
const h1 = document.querySelector("#greeting");
// 2단계
const callback = function (e) {
    e.preventDefault();
    console.log("submit");
    localStorage.setItem("userName", input.value);
    const savedName = localStorage.getItem("userName");
    console.log(savedName);
    h1.innerHTML = savedName;
};


// 3단계
loginForm.addEventListener("submit", callback);