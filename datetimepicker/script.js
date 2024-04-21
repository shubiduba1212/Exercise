$(".start_time").datetimepicker({ 
    format: "Y-m-d H:i",
    onClose: function(ct, $i) {
      let endDateInput = $(".end_time");
      console.log(endDateInput);
      console.log(ct);
      console.log($i);
      if($(".end_time input").val() != ''){//종료날짜에 입력한 날짜가 있는 상태에서 시작날짜를 설정할 경우
          console.log($(".end_time input").val());
          console.log(getFormatDateTime(ct));
          let tempStartDate = new Date(ct); //종료날짜에 따른 시작날짜 임시설정
          
          let tempEndDate = new Date(endDateInput.val());//종료날짜에 입력한 날짜를 임시 종료날짜로 설정
          if(tempStartDate > tempEndDate){ //시작날짜가 종료날짜보다 뒤인 경우
              endDateInput.val(getFormatDateTime(ct));
          }
      }else {
          endDateInput.val(getFormatDateTime(ct));
      }
    }, onSelectDate: function(ct, $i){
        $(".end_time input").datetimepicker('setOptions', { minDate: ct });
        $(".end_time input").datetimepicker('setOptions', { minTime: ct });
    }, onSelectTime: function(ct, $i){
        $(".end_time input").datetimepicker('setOptions', { minDate: ct });
        $(".end_time input").datetimepicker('setOptions', { minTime: ct });
    }
  });

  if(tempStartDate.getHours() > new Date().getHours()){//오늘 이후 시간을 선택한 경우
    console.log('시작일자 시간을 다시 설정해주세요.');
    $(".start_time input").val(''); // 시작일자 빈칸으로 변경
    //$(".end_time input").datetimepicker('setOptions', { minTime: time, formatTime:'H:00'});            
  }else if(tempStartDate < new Date()){ //오늘 일자 이전의 시간을 선택한 경우
    console.log('시작일자 시간을 다시 설정해주세요.');
    $(".start_time input").val(''); // 시작일자 빈칸으로 변경
    $(".end_time input").datetimepicker('setOptions', { minTime: time, formatTime:'00:00'});
  }else if(tempStartDate.getDay() == new Date().getDay()){//오늘 일자를 선택한 경우
    $(".end_time input").datetimepicker('setOptions', { minTime: time, formatTime:'H:00'});
  }
  $(".end_time input").datetimepicker('setOptions', { minDate: ct });
  $(".end_time input").datetimepicker('setOptions', { minTime: tempStartDate.getHours() + 1, formatTime:'H:00'});
