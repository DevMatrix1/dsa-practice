// link- https://bigfrontend.dev/react/The-React-Counter

import React,{useState,useCallback} from 'react'

export function App() {
  const [count,setCount]=useState(0);

  const increment= useCallback(()=>setCount(count=>count+1),[]);
  const decrement= useCallback(()=>setCount(count=>count-1),[]);
  return (
    <div>
      <button data-testid="decrement-button" onClick={decrement}>-</button>
      <button data-testid="increment-button" onClick={increment}>+</button>
      <p>clicked: {count}</p>
    </div>
  )
}
