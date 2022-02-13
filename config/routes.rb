Rails.application.routes.draw do
  get "about", to: "about#index"

  get "registration", to: "registration#new"
  post "registration", to: "registration#create"

  get "login", to: "session#new"
  post "login", to: "session#create"
  delete "logout", to: "session#destroy"

  root to: "root#index"
end
