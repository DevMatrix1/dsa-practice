// link- https://bigfrontend.dev/react/useEffectOnce

import { useRef, useEffect, EffectCallback } from 'react'

export function useEffectOnce(effect: EffectCallback) {
  const ref = useRef(effect);
  useEffect(() => ref.current(), []);
}
