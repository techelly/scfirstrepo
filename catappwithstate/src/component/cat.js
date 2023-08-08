import React, { useState } from "react";

const Cat = (props) => {
  const [isHungry, setIsHungry] = useState(true);
  return (
    <h1>
      <p>
        I am {props.name}, and I am {isHungry ? "hungry" : "full"}!
      </p>
      <button type="button"
        onClick={() => {
          setIsHungry(false);
        }}
        disabled={!isHungry}
        title={isHungry ? "Pour me some milk, please!" : "Thank you!"}
      >Check Hungry</button>
    </h1>
  );
}

export default Cat;