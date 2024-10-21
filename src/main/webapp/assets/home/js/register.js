$(document).ready(function() {
  // Masking for birth date and phone number
  $('#birth-date').mask('00/00/0000');
  $('#phone-number').mask('0000-000-000');
  
  // Check if username exists
  function checkUsernameExists(username) {
    return $.ajax({
      url: '${pageContext.request.contextPath}/check-username', // Đường dẫn đến API kiểm tra
      type: 'GET',
      data: { username: username },
    });
  }

  // Form validation
  $('#submit-btn').click(function() {
    let isValid = true;
    
    // Reset error messages
    $('.error-message').hide();

    // Username validation
    const username = $('#username').val().trim();
    if (username === "") {
      $('#username-error').show();
      isValid = false;
    } else {
      // Check if username exists
      checkUsernameExists(username).done(function(response) {
        if (response.exists) {
          $('#username-exists-error').show();
          isValid = false;
        } else {
          $('#username-exists-error').hide();
        }
      });
    }

    // Password validation
    if ($('#password').val().trim() === "") {
      $('#password-error').show();
      isValid = false;
    }

    // Confirm password validation
    if ($('#confirmpassword').val().trim() !== $('#password').val().trim()) {
      $('#confirmpassword-error').show();
      isValid = false;
    }

    // Email validation
    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    if (!emailPattern.test($('#email').val().trim())) {
      $('#email-error').show();
      isValid = false;
    }

    // Phone number validation
    if ($('#phone-number').val().trim() === "") {
      $('#phone-error').show();
      isValid = false;
    }

    // Birth date validation
    if ($('#birth-date').val().trim() === "") {
      $('#birthdate-error').show();
      isValid = false;
    }

    // If form is valid and username is available, submit it
    if (isValid) {
      alert("Form is valid and ready for submission!");
      // Code to submit form
    }
  });
});
