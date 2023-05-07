//반복문에서 사용하는 break와 continue

//continue - 컨티뉴 아래 코드를 실행하지 않고 반복

const users = ["Smith", "Tom", "Steve", "Allen"];

for (let i=0; i<users.length; i++) {
    if (users[i] === "Tom") {
        continue;
    }    
    console.log(users[i]);
}