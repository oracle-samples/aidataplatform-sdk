# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class IdentityUserMetadatum(object):
    """
    The user metadata for a given id.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new IdentityUserMetadatum object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param user_id:
            The value to assign to the user_id property of this IdentityUserMetadatum.
        :type user_id: str

        :param user_name:
            The value to assign to the user_name property of this IdentityUserMetadatum.
        :type user_name: str

        :param user_display_name:
            The value to assign to the user_display_name property of this IdentityUserMetadatum.
        :type user_display_name: str

        :param user_email:
            The value to assign to the user_email property of this IdentityUserMetadatum.
        :type user_email: str

        """
        self.swagger_types = {
            'user_id': 'str',
            'user_name': 'str',
            'user_display_name': 'str',
            'user_email': 'str'
        }

        self.attribute_map = {
            'user_id': 'userId',
            'user_name': 'userName',
            'user_display_name': 'userDisplayName',
            'user_email': 'userEmail'
        }

        self._user_id = None
        self._user_name = None
        self._user_display_name = None
        self._user_email = None

    @property
    def user_id(self):
        """
        **[Required]** Gets the user_id of this IdentityUserMetadatum.
        The ID of the user.


        :return: The user_id of this IdentityUserMetadatum.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """
        Sets the user_id of this IdentityUserMetadatum.
        The ID of the user.


        :param user_id: The user_id of this IdentityUserMetadatum.
        :type: str
        """
        self._user_id = user_id

    @property
    def user_name(self):
        """
        **[Required]** Gets the user_name of this IdentityUserMetadatum.
        The unique id used during login as name.


        :return: The user_name of this IdentityUserMetadatum.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name):
        """
        Sets the user_name of this IdentityUserMetadatum.
        The unique id used during login as name.


        :param user_name: The user_name of this IdentityUserMetadatum.
        :type: str
        """
        self._user_name = user_name

    @property
    def user_display_name(self):
        """
        Gets the user_display_name of this IdentityUserMetadatum.
        The display name used by the user


        :return: The user_display_name of this IdentityUserMetadatum.
        :rtype: str
        """
        return self._user_display_name

    @user_display_name.setter
    def user_display_name(self, user_display_name):
        """
        Sets the user_display_name of this IdentityUserMetadatum.
        The display name used by the user


        :param user_display_name: The user_display_name of this IdentityUserMetadatum.
        :type: str
        """
        self._user_display_name = user_display_name

    @property
    def user_email(self):
        """
        Gets the user_email of this IdentityUserMetadatum.
        The email of the user.


        :return: The user_email of this IdentityUserMetadatum.
        :rtype: str
        """
        return self._user_email

    @user_email.setter
    def user_email(self, user_email):
        """
        Sets the user_email of this IdentityUserMetadatum.
        The email of the user.


        :param user_email: The user_email of this IdentityUserMetadatum.
        :type: str
        """
        self._user_email = user_email

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
