// // Volume of a Cuboid
// Bob needs a fast way to calculate the volume of a cuboid with three values: the length, width and height of the cuboid. Write a function to help Bob with this calculation.
class Kata {
    static getVolumeOfCuboid(length, width, height) {
      return length*width*height
    }
  }
  console.log(Kata.getVolumeOfCuboid(1,2,2))
  console.log(Kata.getVolumeOfCuboid(6.3,2,5), 63)