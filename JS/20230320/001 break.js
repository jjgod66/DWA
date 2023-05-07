//반복문에서 사용하는 break와 continue

//break - 중간에 반복을 멈추고 나감

//
//

let index = 0;
const users = ["Smith", "Tom", "Steve", "Allen"];

const func = function (x, y) {
    for (let i=0; i<x.length; i++) {
        if (x[i]===y) {
            index = i;
            break;  
        } else {
            index = -1;
        }
    }
};
func(users, "Smith");
if (index < 0) {
    console.log("존재하지않음");
} else {
    console.log(`인덱스 ${index}에 있음`)
}

//
//

const func2 = function (x, y) {
    for (let i=0; i<x.length; i++) {
        if (x[i]===y) {
            index = i
            return i;
        }
    }
    index = -1
    return index;
}

if (func2(users, "Tom") < 0) {
    console.log("존재하지않습니다.")
} else {
    console.log(`인덱스번호는 ${index}입니다`)
}

//
//

const func3 = function (x, y) {
    //배열에서 찾으면 위치를 리턴한다
    //못찾으면 -1을 리턴한다
    let i = 0;
    for (i; i<x.length; i++) {
        if (x[i] === y) {
            break;
        }
    }
    if (i <x.length) { //찾으면
        return i;
    } else { //못찾으면
        return -1;
    }
}
const result_func3 = func3(users, "Alice");
if (result_func3 < 0) {
    console.log("존재하지않음");
} else {
    console.log(`${result_func3}번째 위치에 있음`)
}



