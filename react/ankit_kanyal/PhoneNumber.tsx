// link- https://bigfrontend.dev/react/phone-number-input

import React from 'react'
export function PhoneNumberInput() {
  let [value,setValue] = React.useState<string>("");
  let formatNumber = (event: React.ChangeEvent<HTMLInputElement>) => {
    let curr = event.currentTarget.value.replace(/\D/g,'');
    if(curr.length > 10) curr = curr.slice(0,10)
    if(curr.length > 6) curr = `${curr.slice(0,6)}-${curr.slice(6)}`
    if(curr.length > 3) curr = `(${curr.slice(0,3)})${curr.slice(3)}`
    setValue(curr);
  } 
  return <input data-testid="phone-number-input" value={value} onChange={formatNumber}/>
}
