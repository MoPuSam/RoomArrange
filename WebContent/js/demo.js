/**
 * Particleground demo
 * @author Jonathan Nicol - @mrjnicol
 */

$(document).ready(function() {
  $('#particles').particleground({
    dotColor: '#eeeeee',
    lineColor: '#eeeeee'
  });
  $('.intro').css({
    'margin-top': -($('.intro').height() / 2)
  });
});