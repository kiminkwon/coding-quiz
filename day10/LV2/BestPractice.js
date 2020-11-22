function numericals(input) {
    let obj = {};
    let result = "";
    for (let i = 0; i < input.length; i += 1) {
        let current = input[i];
        if (obj[current]) {
            obj[current] += 1;
        } else {
            obj[current] = 1;
        }

        result += obj[current];
    }

    return result;
}