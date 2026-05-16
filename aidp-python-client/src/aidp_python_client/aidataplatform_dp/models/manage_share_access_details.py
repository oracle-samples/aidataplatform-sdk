# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ManageShareAccessDetails(object):
    """
    Information to perform grant/revoke consumption access on a share to/from a recipient.
    """

    #: A constant which can be used with the action property of a ManageShareAccessDetails.
    #: This constant has a value of "GRANT"
    ACTION_GRANT = "GRANT"

    #: A constant which can be used with the action property of a ManageShareAccessDetails.
    #: This constant has a value of "REVOKE"
    ACTION_REVOKE = "REVOKE"

    def __init__(self, **kwargs):
        """
        Initializes a new ManageShareAccessDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param action:
            The value to assign to the action property of this ManageShareAccessDetails.
            Allowed values for this property are: "GRANT", "REVOKE"
        :type action: str

        :param recipient:
            The value to assign to the recipient property of this ManageShareAccessDetails.
        :type recipient: str

        """
        self.swagger_types = {
            'action': 'str',
            'recipient': 'str'
        }

        self.attribute_map = {
            'action': 'action',
            'recipient': 'recipient'
        }

        self._action = None
        self._recipient = None

    @property
    def action(self):
        """
        **[Required]** Gets the action of this ManageShareAccessDetails.
        The action. Either Grant or Revoke.

        Allowed values for this property are: "GRANT", "REVOKE"


        :return: The action of this ManageShareAccessDetails.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """
        Sets the action of this ManageShareAccessDetails.
        The action. Either Grant or Revoke.


        :param action: The action of this ManageShareAccessDetails.
        :type: str
        """
        allowed_values = ["GRANT", "REVOKE"]
        if not value_allowed_none_or_none_sentinel(action, allowed_values):
            raise ValueError(
                "Invalid value for `action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._action = action

    @property
    def recipient(self):
        """
        **[Required]** Gets the recipient of this ManageShareAccessDetails.
        The simplified name of the grantee.


        :return: The recipient of this ManageShareAccessDetails.
        :rtype: str
        """
        return self._recipient

    @recipient.setter
    def recipient(self, recipient):
        """
        Sets the recipient of this ManageShareAccessDetails.
        The simplified name of the grantee.


        :param recipient: The recipient of this ManageShareAccessDetails.
        :type: str
        """
        self._recipient = recipient

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
