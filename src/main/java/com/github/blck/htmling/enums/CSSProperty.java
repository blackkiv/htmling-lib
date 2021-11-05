package com.github.blck.htmling.enums;

public enum CSSProperty {

  /**
   * Specifies the alignment of flexible container's items within the flex container.
   */
  ALIGN_CONTENT("align-content"),

  /**
   * Specifies the default alignment for items within the flex container.
   */
  ALIGN_ITEMS("align-items"),

  /**
   * Specifies the alignment for selected items within the flex container.
   */
  ALIGN_SELF("align-self"),

  /**
   * Specifies the keyframe-based animations.
   */
  ANIMATION("animation"),

  /**
   * Specifies when the animation will start.
   */
  ANIMATION_DELAY("animation-delay"),

  /**
   * Specifies whether the animation should play in reverse on alternate cycles or not.
   */
  ANIMATION_DIRECTION("animation-direction"),

  /**
   * Specifies the number of seconds or milliseconds an animation should take to complete one
   * cycle.
   */
  ANIMATION_DURATION("animation-duration"),

  /**
   * Specifies how a CSS animation should apply styles to its target before and after it is
   * executing.
   */
  ANIMATION_FILL_MODE("animation-fill-mode"),

  /**
   * Specifies the number of times an animation cycle should be played before stopping.
   */
  ANIMATION_ITERATION_COUNT("animation-iteration-count"),

  /**
   * Specifies the name of @keyframes defined animations that should be applied to the selected
   * element.
   */
  ANIMATION_NAME("animation-name"),

  /**
   * Specifies whether the animation is running or paused.
   */
  ANIMATION_PLAY_STATE("animation-play-state"),

  /**
   * Specifies how a CSS animation should progress over the duration of each cycle.
   */
  ANIMATION_TIMING_FUNCTION("animation-timing-function"),

  /**
   * Specifies whether or not the "back" side of a transformed element is visible when facing the
   * user.
   */
  BACKFACE_VISIBILITY("backface-visibility"),

  /**
   * Defines a variety of background properties within one declaration.
   */
  BACKGROUND("background"),

  /**
   * Specify whether the background image is fixed in the viewport or scrolls.
   */
  BACKGROUND_ATTACHMENT("background-attachment"),

  /**
   * Specifies the painting area of the background.
   */
  BACKGROUND_CLIP("background-clip"),

  /**
   * Defines an element's background color.
   */
  BACKGROUND_COLOR("background-color"),

  /**
   * Defines an element's background image.
   */
  BACKGROUND_IMAGE("background-image"),

  /**
   * Specifies the positioning area of the background images.
   */
  BACKGROUND_ORIGIN("background-origin"),

  /**
   * Defines the origin of a background image.
   */
  BACKGROUND_POSITION("background-position"),

  /**
   * Specify whether/how the background image is tiled.
   */
  BACKGROUND_REPEAT("background-repeat"),

  /**
   * Specifies the size of the background images.
   */
  BACKGROUND_SIZE("background-size"),

  /**
   * Sets the width, style, and color for all four sides of an element's border.
   */
  BORDER("border"),

  /**
   * Sets the width, style, and color of the bottom border of an element.
   */
  BORDER_BOTTOM("border-bottom"),

  /**
   * Sets the color of the bottom border of an element.
   */
  BORDER_BOTTOM_COLOR("border-bottom-color"),

  /**
   * Defines the shape of the bottom-left border corner of an element.
   */
  BORDER_BOTTOM_LEFT_RADIUS("border-bottom-left-radius"),

  /**
   * Defines the shape of the bottom-right border corner of an element.
   */
  BORDER_BOTTOM_RIGHT_RADIUS("border-bottom-right-radius"),

  /**
   * Sets the style of the bottom border of an element.
   */
  BORDER_BOTTOM_STYLE("border-bottom-style"),

  /**
   * Sets the width of the bottom border of an element.
   */
  BORDER_BOTTOM_WIDTH("border-bottom-width"),

  /**
   * Specifies whether table cell borders are connected or separated.
   */
  BORDER_COLLAPSE("border-collapse"),

  /**
   * Sets the color of the border on all the four sides of an element.
   */
  BORDER_COLOR("border-color"),

  /**
   * Specifies how an image is to be used in place of the border styles.
   */
  BORDER_IMAGE("border-image"),

  /**
   * Specifies the amount by which the border image area extends beyond the border box.
   */
  BORDER_IMAGE_OUTSET("border-image-outset"),

  /**
   * Specifies whether the image-border should be repeated, rounded or stretched.
   */
  BORDER_IMAGE_REPEAT("border-image-repeat"),

  /**
   * Specifies the inward offsets of the image-border.
   */
  BORDER_IMAGE_SLICE("border-image-slice"),

  /**
   * Specifies the location of the image to be used as a border.
   */
  BORDER_IMAGE_SOURCE("border-image-source"),

  /**
   * Specifies the width of the image-border.
   */
  BORDER_IMAGE_WIDTH("border-image-width"),

  /**
   * Sets the width, style, and color of the left border of an element.
   */
  BORDER_LEFT("border-left"),

  /**
   * Sets the color of the left border of an element.
   */
  BORDER_LEFT_COLOR("border-left-color"),

  /**
   * Sets the style of the left border of an element.
   */
  BORDER_LEFT_STYLE("border-left-style"),

  /**
   * Sets the width of the left border of an element.
   */
  BORDER_LEFT_WIDTH("border-left-width"),

  /**
   * Defines the shape of the border corners of an element.
   */
  BORDER_RADIUS("border-radius"),

  /**
   * Sets the width, style, and color of the right border of an element.
   */
  BORDER_RIGHT("border-right"),

  /**
   * Sets the color of the right border of an element.
   */
  BORDER_RIGHT_COLOR("border-right-color"),

  /**
   * Sets the style of the right border of an element.
   */
  BORDER_RIGHT_STYLE("border-right-style"),

  /**
   * Sets the width of the right border of an element.
   */
  BORDER_RIGHT_WIDTH("border-right-width"),

  /**
   * Sets the spacing between the borders of adjacent table cells.
   */
  BORDER_SPACING("border-spacing"),

  /**
   * Sets the style of the border on all the four sides of an element.
   */
  BORDER_STYLE("border-style"),

  /**
   * Sets the width, style, and color of the top border of an element.
   */
  BORDER_TOP("border-top"),

  /**
   * Sets the color of the top border of an element.
   */
  BORDER_TOP_COLOR("border-top-color"),

  /**
   * Defines the shape of the top-left border corner of an element.
   */
  BORDER_TOP_LEFT_RADIUS("border-top-left-radius"),

  /**
   * Defines the shape of the top-right border corner of an element.
   */
  BORDER_TOP_RIGHT_RADIUS("border-top-right-radius"),

  /**
   * Sets the style of the top border of an element.
   */
  BORDER_TOP_STYLE("border-top-style"),

  /**
   * Sets the width of the top border of an element.
   */
  BORDER_TOP_WIDTH("border-top-width"),

  /**
   * Sets the width of the border on all the four sides of an element.
   */
  BORDER_WIDTH("border-width"),

  /**
   * Specify the location of the bottom edge of the positioned element.
   */
  BOTTOM("bottom"),

  /**
   * Applies one or more drop-shadows to the element's box.
   */
  BOX_SHADOW("box-shadow"),

  /**
   * Alter the default CSS box model.
   */
  BOX_SIZING("box-sizing"),

  /**
   * Specify the position of table's caption.
   */
  CAPTION_SIDE("caption-side"),

  /**
   * Specifies the placement of an element in relation to floating elements.
   */
  CLEAR("clear"),

  /**
   * Defines the clipping region.
   */
  CLIP("clip"),

  /**
   * Specify the color of the text of an element.
   */
  COLOR("color"),

  /**
   * Specifies the number of columns in a multi-column element.
   */
  COLUMN_COUNT("column-count"),

  /**
   * Specifies how columns will be filled.
   */
  COLUMN_FILL("column-fill"),

  /**
   * Specifies the gap between the columns in a multi-column element.
   */
  COLUMN_GAP("column-gap"),

  /**
   * Specifies a straight line, or "rule", to be drawn between each column in a multi-column
   * element.
   */
  COLUMN_RULE("column-rule"),

  /**
   * Specifies the color of the rules drawn between columns in a multi-column layout.
   */
  COLUMN_RULE_COLOR("column-rule-color"),

  /**
   * Specifies the style of the rule drawn between the columns in a multi-column layout.
   */
  COLUMN_RULE_STYLE("column-rule-style"),

  /**
   * Specifies the width of the rule drawn between the columns in a multi-column layout.
   */
  COLUMN_RULE_WIDTH("column-rule-width"),

  /**
   * Specifies how many columns an element spans across in a multi-column layout.
   */
  COLUMN_SPAN("column-span"),

  /**
   * Specifies the optimal width of the columns in a multi-column element.
   */
  COLUMN_WIDTH("column-width"),

  /**
   * A shorthand property for setting column-width and column-count properties.
   */
  COLUMNS("columns"),

  /**
   * Inserts generated content.
   */
  CONTENT("content"),

  /**
   * Increments one or more counter values.
   */
  COUNTER_INCREMENT("counter-increment"),

  /**
   * Creates or resets one or more counters.
   */
  COUNTER_RESET("counter-reset"),

  /**
   * Specify the type of cursor.
   */
  CURSOR("cursor"),

  /**
   * Define the text direction/writing direction.
   */
  DIRECTION("direction"),

  /**
   * Specifies how an element is displayed onscreen.
   */
  DISPLAY("display"),

  /**
   * Show or hide borders and backgrounds of empty table cells.
   */
  EMPTY_CELLS("empty-cells"),

  /**
   * Specifies the components of a flexible length.
   */
  FLEX("flex"),

  /**
   * Specifies the initial main size of the flex item.
   */
  FLEX_BASIS("flex-basis"),

  /**
   * Specifies the direction of the flexible items.
   */
  FLEX_DIRECTION("flex-direction"),

  /**
   * A shorthand property for the flex-direction and the flex-wrap properties.
   */
  FLEX_FLOW("flex-flow"),

  /**
   * Specifies how the flex item will grow relative to the other items inside the flex container.
   */
  FLEX_GROW("flex-grow"),

  /**
   * Specifies how the flex item will shrink relative to the other items inside the flex container.
   */
  FLEX_SHRINK("flex-shrink"),

  /**
   * Specifies whether the flexible items should wrap or not.
   */
  FLEX_WRAP("flex-wrap"),

  /**
   * Specifies whether or not a box should float.
   */
  FLOAT("float"),

  /**
   * Defines a variety of font properties within one declaration.
   */
  FONT("font"),

  /**
   * Defines a list of fonts for element.
   */
  FONT_FAMILY("font-family"),

  /**
   * Defines the font size for the text.
   */
  FONT_SIZE("font-size"),

  /**
   * Preserves the readability of text when font fallback occurs.
   */
  FONT_SIZE_ADJUST("font-size-adjust"),

  /**
   * Selects a normal, condensed, or expanded face from a font.
   */
  FONT_STRETCH("font-stretch"),

  /**
   * Defines the font style for the text.
   */
  FONT_STYLE("font-style"),

  /**
   * Specify the font variant.
   */
  FONT_VARIANT("font-variant"),

  /**
   * Specify the font weight of the text.
   */
  FONT_WEIGHT("font-weight"),

  /**
   * Specify the height of an element.
   */
  HEIGHT("height"),

  /**
   * Specifies how flex items are aligned along the main axis of the flex container after any
   * flexible lengths and auto margins have been resolved.
   */
  JUSTIFY_CONTENT("justify-content"),

  /**
   * Specify the location of the left edge of the positioned element.
   */
  LEFT("left"),

  /**
   * Sets the extra spacing between letters.
   */
  LETTER_SPACING("letter-spacing"),

  /**
   * Sets the height between lines of text.
   */
  LINE_HEIGHT("line-height"),

  /**
   * Defines the display style for a list and list elements.
   */
  LIST_STYLE("list-style"),

  /**
   * Specifies the image to be used as a list-item marker.
   */
  LIST_STYLE_IMAGE("list-style-image"),

  /**
   * Specifies the position of the list-item marker.
   */
  LIST_STYLE_POSITION("list-style-position"),

  /**
   * Specifies the marker style for a list-item.
   */
  LIST_STYLE_TYPE("list-style-type"),

  /**
   * Sets the margin on all four sides of the element.
   */
  MARGIN("margin"),

  /**
   * Sets the bottom margin of the element.
   */
  MARGIN_BOTTOM("margin-bottom"),

  /**
   * Sets the left margin of the element.
   */
  MARGIN_LEFT("margin-left"),

  /**
   * Sets the right margin of the element.
   */
  MARGIN_RIGHT("margin-right"),

  /**
   * Sets the top margin of the element.
   */
  MARGIN_TOP("margin-top"),

  /**
   * Specify the maximum height of an element.
   */
  MAX_HEIGHT("max-height"),

  /**
   * Specify the maximum width of an element.
   */
  MAX_WIDTH("max-width"),

  /**
   * Specify the minimum height of an element.
   */
  MIN_HEIGHT("min-height"),

  /**
   * Specify the minimum width of an element.
   */
  MIN_WIDTH("min-width"),

  /**
   * Specifies the transparency of an element.
   */
  OPACITY("opacity"),

  /**
   * Specifies the order in which a flex items are displayed and laid out within a flex container.
   */
  ORDER("order"),

  /**
   * Sets the width, style, and color for all four sides of an element's outline.
   */
  OUTLINE("outline"),

  /**
   * Sets the color of the outline.
   */
  OUTLINE_COLOR("outline-color"),

  /**
   * Set the space between an outline and the border edge of an element.
   */
  OUTLINE_OFFSET("outline-offset"),

  /**
   * Sets a style for an outline.
   */
  OUTLINE_STYLE("outline-style"),

  /**
   * Sets the width of the outline.
   */
  OUTLINE_WIDTH("outline-width"),

  /**
   * Specifies the treatment of content that overflows the element's box.
   */
  OVERFLOW("overflow"),

  /**
   * Specifies the treatment of content that overflows the element's box horizontally.
   */
  OVERFLOW_X("overflow-x"),

  /**
   * Specifies the treatment of content that overflows the element's box vertically.
   */
  OVERFLOW_Y("overflow-y"),

  /**
   * Sets the padding on all four sides of the element.
   */
  PADDING("padding"),

  /**
   * Sets the padding to the bottom side of an element.
   */
  PADDING_BOTTOM("padding-bottom"),

  /**
   * Sets the padding to the left side of an element.
   */
  PADDING_LEFT("padding-left"),

  /**
   * Sets the padding to the right side of an element.
   */
  PADDING_RIGHT("padding-right"),

  /**
   * Sets the padding to the top side of an element.
   */
  PADDING_TOP("padding-top"),

  /**
   * Insert a page breaks after an element.
   */
  PAGE_BREAK_AFTER("page-break-after"),

  /**
   * Insert a page breaks before an element.
   */
  PAGE_BREAK_BEFORE("page-break-before"),

  /**
   * Insert a page breaks inside an element.
   */
  PAGE_BREAK_INSIDE("page-break-inside"),

  /**
   * Defines the perspective from which all child elements of the object are viewed.
   */
  PERSPECTIVE("perspective"),

  /**
   * Defines the origin (the vanishing point for the 3D space) for the perspective property.
   */
  PERSPECTIVE_ORIGIN("perspective-origin"),

  /**
   * Specifies how an element is positioned.
   */
  POSITION("position"),

  /**
   * Specifies quotation marks for embedded quotations.
   */
  QUOTES("quotes"),

  /**
   * Specifies whether or not an element is resizable by the user.
   */
  RESIZE("resize"),

  /**
   * Specify the location of the right edge of the positioned element.
   */
  RIGHT("right"),

  /**
   * Specifies the length of the tab character.
   */
  TAB_SIZE("tab-size"),

  /**
   * Specifies a table layout algorithm.
   */
  TABLE_LAYOUT("table-layout"),

  /**
   * Sets the horizontal alignment of inline content.
   */
  TEXT_ALIGN("text-align"),

  /**
   * Specifies how the last line of a block or a line right before a forced line break is aligned
   * when text-align is justify.
   */
  TEXT_ALIGN_LAST("text-align-last"),

  /**
   * Specifies the decoration added to text.
   */
  TEXT_DECORATION("text-decoration"),

  /**
   * Specifies the color of the text-decoration-line.
   */
  TEXT_DECORATION_COLOR("text-decoration-color"),

  /**
   * Specifies what kind of line decorations are added to the element.
   */
  TEXT_DECORATION_LINE("text-decoration-line"),

  /**
   * Specifies the style of the lines specified by the text-decoration-line property
   */
  TEXT_DECORATION_STYLE("text-decoration-style"),

  /**
   * Indent the first line of text.
   */
  TEXT_INDENT("text-indent"),

  /**
   * Specifies the justification method to use when the text-align property is set to justify.
   */
  TEXT_JUSTIFY("text-justify"),

  /**
   * Specifies how the text content will be displayed, when it overflows the block containers.
   */
  TEXT_OVERFLOW("text-overflow"),

  /**
   * Applies one or more shadows to the text content of an element.
   */
  TEXT_SHADOW("text-shadow"),

  /**
   * Transforms the case of the text.
   */
  TEXT_TRANSFORM("text-transform"),

  /**
   * Specify the location of the top edge of the positioned element.
   */
  TOP("top"),

  /**
   * Applies a 2D or 3D transformation to an element.
   */
  TRANSFORM("transform"),

  /**
   * Defines the origin of transformation for an element.
   */
  TRANSFORM_ORIGIN("transform-origin"),

  /**
   * Specifies how nested elements are rendered in 3D space.
   */
  TRANSFORM_STYLE("transform-style"),

  /**
   * Defines the transition between two states of an element.
   */
  TRANSITION("transition"),

  /**
   * Specifies when the transition effect will start.
   */
  TRANSITION_DELAY("transition-delay"),

  /**
   * Specifies the number of seconds or milliseconds a transition effect should take to complete.
   */
  TRANSITION_DURATION("transition-duration"),

  /**
   * Specifies the names of the CSS properties to which a transition effect should be applied.
   */
  TRANSITION_PROPERTY("transition-property"),

  /**
   * Specifies the speed curve of the transition effect.
   */
  TRANSITION_TIMING_FUNCTION("transition-timing-function"),

  /**
   * Sets the vertical positioning of an element relative to the current text baseline.
   */
  VERTICAL_ALIGN("vertical-align"),

  /**
   * Specifies whether or not an element is visible.
   */
  VISIBILITY("visibility"),

  /**
   * Specifies how white space inside the element is handled.
   */
  WHITE_SPACE("white-space"),

  /**
   * Specify the width of an element.
   */
  WIDTH("width"),

  /**
   * Specifies how to break lines within words.
   */
  WORD_BREAK("word-break"),

  /**
   * Sets the spacing between words.
   */
  WORD_SPACING("word-spacing"),

  /**
   * Specifies whether to break words when the content overflows the boundaries of its container.
   */
  WORD_WRAP("word-wrap"),

  /**
   * Specifies a layering or stacking order for positioned elements.
   */
  Z_INDEX("z-index");

  String propertyName;

  CSSProperty(String propertyName) {
    this.propertyName = propertyName;
  }

  @Override
  public String toString() {
    return propertyName;
  }
}
