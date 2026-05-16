# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NodeOutput(object):
    """
    An output slot for a node, including type and requirements.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new NodeOutput object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this NodeOutput.
        :type name: str

        :param type:
            The value to assign to the type property of this NodeOutput.
        :type type: oci.aidataplatform_dp.models.NodeIo

        :param description:
            The value to assign to the description property of this NodeOutput.
        :type description: str

        :param is_required:
            The value to assign to the is_required property of this NodeOutput.
        :type is_required: bool

        """
        self.swagger_types = {
            'name': 'str',
            'type': 'NodeIo',
            'description': 'str',
            'is_required': 'bool'
        }

        self.attribute_map = {
            'name': 'name',
            'type': 'type',
            'description': 'description',
            'is_required': 'isRequired'
        }

        self._name = None
        self._type = None
        self._description = None
        self._is_required = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this NodeOutput.
        Unique name for the output slot.


        :return: The name of this NodeOutput.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this NodeOutput.
        Unique name for the output slot.


        :param name: The name of this NodeOutput.
        :type: str
        """
        self._name = name

    @property
    def type(self):
        """
        **[Required]** Gets the type of this NodeOutput.

        :return: The type of this NodeOutput.
        :rtype: oci.aidataplatform_dp.models.NodeIo
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this NodeOutput.

        :param type: The type of this NodeOutput.
        :type: oci.aidataplatform_dp.models.NodeIo
        """
        self._type = type

    @property
    def description(self):
        """
        Gets the description of this NodeOutput.
        Documentation or tooltip shown in the UI.


        :return: The description of this NodeOutput.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this NodeOutput.
        Documentation or tooltip shown in the UI.


        :param description: The description of this NodeOutput.
        :type: str
        """
        self._description = description

    @property
    def is_required(self):
        """
        **[Required]** Gets the is_required of this NodeOutput.
        True if this output is mandatory.


        :return: The is_required of this NodeOutput.
        :rtype: bool
        """
        return self._is_required

    @is_required.setter
    def is_required(self, is_required):
        """
        Sets the is_required of this NodeOutput.
        True if this output is mandatory.


        :param is_required: The is_required of this NodeOutput.
        :type: bool
        """
        self._is_required = is_required

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
