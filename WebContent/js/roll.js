$(function() {
		//���ñ���
		var config = {
			showNum : 11,	//���ù�������ʾ����
			autoScroll : true,	//�Ƿ��Զ�������Ĭ��Ϊ false
			autoScrollInterval : 3000	//�Զ����������Ĭ��Ϊ 3000 ���룬autoScroll = true ʱ����Ч
		}
		
		var scrollUlWidth = $('.wrapper ul li').outerWidth(true),	//���� li �Ŀ��
			scrollUlLeft = 0,	//.scroll_ul ��ʹ��ʱ�� left ֵΪ 0
			prevAllow = true,	//Ϊ�˷�ֹ���������һҳ��ť
			nextAllow = true;	//Ϊ�˷�ֹ���������һҳ��ť
			
		//���㸸�����޿�
		$('.wrapper').width(config.showNum * scrollUlWidth);

		//�����һҳ
		$('#prev').mouseover(function() {
			if (prevAllow) {
				prevAllow = false;
				scrollUlLeft = scrollUlLeft - scrollUlWidth;
				$('.wrapper ul').css('left', scrollUlLeft);
				//�������һ�� li �����뵽 ul ����ǰ��
				$('.wrapper ul li:last').clone().prependTo('.wrapper ul');
				//ɾ�����һ�� li
				$('.wrapper ul li:last').remove();
				$('.wrapper ul').animate({
					left : scrollUlLeft + scrollUlWidth
				}, 1500, function() {
					scrollUlLeft = parseInt($('.wrapper ul').css('left'), 10);
					prevAllow = true;
				})
			}
		});
		
		//�����һҳ
		$('#next').mouseover(function() {
			if (nextAllow) {
				nextAllow = false;
				$('.wrapper ul').animate({
					left : scrollUlLeft - scrollUlWidth
				}, 1500, function() {
					scrollUlLeft = parseInt($('.wrapper ul').css('left'), 10);
					scrollUlLeft = scrollUlLeft + scrollUlWidth;
					$('.wrapper ul').css('left', scrollUlLeft);
					//���Ƶ�һ�� li �����뵽 ul �������
					$('.wrapper ul li:first').clone().appendTo('.wrapper ul');
					//ɾ����һ�� li
					$('.wrapper ul li:first').remove();
					nextAllow = true;
				})
			}
		});
		
		//�Զ�����
		if (config.autoScroll) {
			setInterval(function() {
				$('#next').trigger('mouseover');
			}, config.autoScrollInterval)
		}
	})