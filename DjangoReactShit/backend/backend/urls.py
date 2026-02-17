
from django.contrib import admin
from django.urls import path, include
from backend.api.views import CreateUserView # Essa é a função que escrevi dentro de views
from rest_framework_simplejwt.views import TokenObtainPairView, TokenRefreshView # São funções prontas com a lógica de um JWT 

urlpatterns = [
    path('admin/', admin.site.urls),
    path("api/user/register/", CreateUserView.as_view(), name='register'),
    path('api/token/', TokenObtainPairView.as_view(), name="get_token"),
    path('api/token/refresh/', TokenRefreshView.as_view(), name="refresh"), # Os nomes podem ser qualquer um
    path('api-auth/', include("rest_framework.urls")),
	path("api/", include("api.urls")),
]