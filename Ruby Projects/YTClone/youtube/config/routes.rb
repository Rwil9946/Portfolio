Rails.application.routes.draw do
  devise_for :users
  resources :posts
  # Define your application routes per the DSL in https://guides.rubyonrails.org/routing.html

  # Defines the root path route ("/")
  root "posts#index"

  devise_scope :user do
    get 'users/sign_out' => "devise/sessions#destroy"
  end
end
