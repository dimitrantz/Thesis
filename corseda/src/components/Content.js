import React from "react";
import "./css/Content.css";
import PropTypes from "prop-types";

function Content(props) {
  return (
    <div className="content">
        
        <span>{props.name}</span>

    </div>
  );
}

Content.propTypes = {
    name: PropTypes.string.isRequired
  };

export default Content;