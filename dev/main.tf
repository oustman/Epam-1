provider "aws" {
  region = "us-east-1"
}

##############
# IAM account
##############
module "iam-account" {
  source = "../modules/iam-account"

  account_alias = "test-accout5252022"

  minimum_password_length = 6
  require_numbers         = false
}

module "iam-user" {
    source = "../modules/iam-user"
    name = "user525220022244"
    path = "/system/"
    force_destroy = true

  
}
module "iam-policy" {
  source = "../modules/iam-policy"
    name        = "example"
  path        = "/"
  description = "My example policy"

  policy = <<EOF
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Action": [
        "ec2:Describe*"
      ],
      "Effect": "Allow",
      "Resource": "*"
    }
  ]
}
EOF

  tags = {
    PolicyDescription = "Policy created using terraformdoc policy"
  }
}
