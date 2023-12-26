from mailjet_rest import Client
import os
print(os.environ)
api_key = '09113a2fb91bab3a67eca0362c38cac8'
api_secret = '114d76d54bb4374789a3ed580c2cbe12'
mailjet = Client(auth=(api_key, api_secret), version='v3.1')
data = {
  'Messages': [
				{
						"From": {
								"Email": "hentosh.pn@ucu.edu.ua",
								"Name": "Me"
						},
						"To": [
								{
										"Email": "ustym.hentosh@gmail.com",
										"Name": "You"
								}
						],
						"Subject": "My first Mailjet Email!",
						"TextPart": "Greetings from Mailjet!",
						"HTMLPart": "<h3>Dear passenger 1, welcome to <a href=\"https://www.mailjet.com/\">Mailjet</a>!</h3><br />May the delivery force be with you!"
				}
		]
}
result = mailjet.send.create(data=data)
print(result.status_code)
print(result.json())