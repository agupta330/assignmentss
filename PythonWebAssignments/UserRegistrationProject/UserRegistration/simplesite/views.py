from django.shortcuts import render_to_response
from .forms import RegistrationForm
from .models import Registartion
from django.shortcuts import render
from django.shortcuts import render_to_response
from django.http import HttpResponseRedirect
from django.contrib.auth.forms import UserCreationForm
from django.core.context_processors import csrf
import func

def home(request):

    return render_to_response('login.html')

#def about(request):
 #   return render_to_response('about.html')

def register(request):
   # If the request method is POST, it means that the form has been submitted
  # and we need to validate it.
  if request.method == 'POST':
    # Create a RegistrationForm instance with the submitted data
    form = RegistrationForm(request.POST)

    # is_valid validates a form and returns True if it is valid and
    # False if it is invalid.
    if form.is_valid():
      # The form is valid and you could save it to a database
      # by creating a model object and populating the
      # data from the form object, but here we are just
      # rendering a success template page.
      name=request.POST.get('name','')
      id=request.POST.get('id','')
      address=request.POST.get('address','')
      username=request.POST.get('username','')
      email=request.POST.get('email','')
      password=request.POST.get('password','')
      password2=request.POST.get('password2','')

      reg_obj=Registartion(name=name,id=id,address=address,username=username,email=email,password=password,password2=password2)
      reg_obj.save()
      return render(request, "registration/registration_complete.html")

 # This means that the request is a GET request. So we need to
 # create an instance of the RegistrationForm class and render it in
 # the template
  else:

   form = RegistrationForm()

 # Render the registration form template with a RegistrationForm instance. If the
 # form was submitted and the data found to be invalid, the template will
 # be rendered with the entered data and error messages. Otherwise an empty
 # form will be rendered. Check the comments in the registration_form.html template
 # to understand how this is done.
  return render(request, "registration/registration_form.html",
                {"form": form })

def registration_complete(request):
    return render_to_response('registration/registration_complete.html')

def login_complete(request):
    return render_to_response('registration/logincontent.html')

def forgotpwd(request):
    return render_to_response('registration/forgot-password.html')