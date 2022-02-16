Rails.application.routes.draw do
  get "about", to: "about#index"

  get "password", to: "passwords#edit", as: "edit_password"
  patch "password", to: "passwords#update"

  get "password/reset", to: "password_resets#new"
  post "password/reset", to: "password_resets#create"
  get "password/reset/edit", to: "password_resets#edit"
  patch "password/reset/edit", to: "password_resets#update"

  get "registration", to: "registration#new"
  post "registration", to: "registration#create"

  get "login", to: "session#new"
  post "login", to: "session#create"
  delete "logout", to: "session#destroy"

  root to: "root#index"
end
