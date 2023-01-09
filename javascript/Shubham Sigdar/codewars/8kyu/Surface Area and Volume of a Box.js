// Write a function that returns the total surface area and volume of a box as an array: [area, volume]

function getSize(width, height, depth){
    let vol= depth * width * height;
    let surfaceArea=2*depth*width+2*depth*height+2*width*height;
    return [surfaceArea, vol]
  }