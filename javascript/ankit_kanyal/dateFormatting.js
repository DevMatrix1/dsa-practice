// Question link is here- https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/javascript


function formatDuration (seconds) {
  // Complete this function
if(seconds===0) return "now";
  
  let minute=parseInt(seconds/60);
  let second=seconds%60;
  let hour=parseInt(minute/60);
  minute%=60;
  let day=parseInt(hour/24);
  hour%=24;
  let year=parseInt(day/365);
  day%=365;
  
  year=year===0?'':`${year} year, `;
  day=day===0?'':`${day} day, `;
  hour=hour===0?'':minute===0 && second===0?`${hour} hour`:`${hour} hour, `;
  minute=minute===0?'':second===0?`${minute} minutes`:`${minute} minute `;
  second=second===0?'':seconds<60?`${seconds} second`:`and ${second} seconds`;
  const formattedTime=`${year}${day}${hour}${minute}${second}`;
  return formattedTime;
}
