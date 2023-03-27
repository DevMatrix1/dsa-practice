// Return a new array consisting of elements which are multiple of their own index in input array (length > 1).

// Some cases:
// [22, -6, 32, 82, 9, 25] =>  [-6, 32, 25]

// [68, -1, 1, -7, 10, 10] => [-1, 10]

// [-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68] => [-85, 72, 0, 68]

function multipleOfIndex(array) {
	// creating a result array where we'll save the needed elements
	let res = [];

	// loop over the array
	for (let i = 0; i < array.length; i++) {
		// check if the current element (array[i]) is a multiple of it's index (i) and if it is...
		if (array[i] % i === 0) {
			// add it to the resulting array
			res.push(array[i]);
		}
	}

	return res;
}