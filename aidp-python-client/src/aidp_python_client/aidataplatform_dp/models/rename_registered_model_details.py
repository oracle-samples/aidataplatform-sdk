# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RenameRegisteredModelDetails(object):
    """
    The data to rename a RegisteredModel.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RenameRegisteredModelDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this RenameRegisteredModelDetails.
        :type name: str

        :param new_name:
            The value to assign to the new_name property of this RenameRegisteredModelDetails.
        :type new_name: str

        """
        self.swagger_types = {
            'name': 'str',
            'new_name': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'new_name': 'new_name'
        }

        self._name = None
        self._new_name = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this RenameRegisteredModelDetails.
        Current name of the registered model.


        :return: The name of this RenameRegisteredModelDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this RenameRegisteredModelDetails.
        Current name of the registered model.


        :param name: The name of this RenameRegisteredModelDetails.
        :type: str
        """
        self._name = name

    @property
    def new_name(self):
        """
        Gets the new_name of this RenameRegisteredModelDetails.
        New name for the registered model.


        :return: The new_name of this RenameRegisteredModelDetails.
        :rtype: str
        """
        return self._new_name

    @new_name.setter
    def new_name(self, new_name):
        """
        Sets the new_name of this RenameRegisteredModelDetails.
        New name for the registered model.


        :param new_name: The new_name of this RenameRegisteredModelDetails.
        :type: str
        """
        self._new_name = new_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
