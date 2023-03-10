// link- https://bigfrontend.dev/react/useToggle

import {useState} from 'react';
export function useToggle(on: boolean): [boolean, () => void] {
  // your code here
  const [state,setState]=useState(on);
  const toggle=()=> setState(state=>!state);

  return [state,toggle];

}
