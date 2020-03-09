import React from "react";
import Content from "./Content";


function ContentList(props) {
  return (
    <div className="content-list">

        {props.contents.map(c => 
            <Content key={c.id} name={c.content} />
          )}
       
    </div>
  );
}

export default ContentList;