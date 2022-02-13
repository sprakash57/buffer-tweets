=begin
email: string -> actual, interactive
has_secure_password method creates three fields
password_digest: string -> actual, non-interactive
password: string -> virtual, interactive
passord_confirmation: string -> virtual, interactive
=end

class User < ApplicationRecord
    has_secure_password
    validates :email, presence: true, format: { with: /\A[^@\s]+@[^@\s]+\z/, message: "Must be valid email" } 
end
