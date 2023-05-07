// 1단계
const loginForm = document.querySelector("#loginForm");
const input = document.querySelector("input");
const h1 = document.querySelector("#greeting");


// 2단계
const callback = function (e) {
    e.preventDefault();
    localStorage.setItem("userName", input.value);
    const savedName = localStorage.getItem("userName");
    h1.innerHTML = savedName;
    if (savedName !== null) { 
        loginForm.classList.add("hidden");
        if (savedName =="") {
            loginForm.classList.remove("hidden");
        }
    }
}
// 3단계
loginForm.addEventListener("submit", callback);

const savedName = localStorage.getItem("userName");
h1.innerHTML = savedName;

if (savedName !== null) { 
    loginForm.classList.add("hidden");
    if (savedName =="") {
        loginForm.classList.remove("hidden");
    }
} else {
    loginForm.classList.remove("hidden");
}
console.log(savedName == "");
console.log(savedName !== null);