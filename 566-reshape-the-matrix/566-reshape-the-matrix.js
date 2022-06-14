/**
 * @param {number[][]} mat
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function (nums, r, c) {
  var arr = nums.flat();
  if (r * c != arr.length) return nums;

  var res = [];
  while (arr.length) res.push(arr.splice(0, c));
  return res;
};