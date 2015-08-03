from django.db import models

class Registartion(models.Model):

  CHOICES =[('opt0', 'male'),('opt1', 'female')]

  name = models.CharField(max_length=20)
  id = models.CharField(max_length=20,primary_key=True)
  address=models.CharField(max_length=20)
  username = models.CharField(max_length=20)
  #gender = models.ChoiceField(choices=CHOICES, widget=models.RadioSelect())

  email = models.EmailField(max_length=20)
  password = models.CharField(max_length=20) # Set the widget to
                                                         # PasswordInput
  password2 = models.CharField(max_length=20)
