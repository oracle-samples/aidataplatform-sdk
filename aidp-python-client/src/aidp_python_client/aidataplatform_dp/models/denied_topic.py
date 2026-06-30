# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeniedTopic(object):
    """
    Denied topic configuration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DeniedTopic object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this DeniedTopic.
        :type name: str

        :param definition:
            The value to assign to the definition property of this DeniedTopic.
        :type definition: str

        :param examples:
            The value to assign to the examples property of this DeniedTopic.
        :type examples: list[str]

        """
        self.swagger_types = {
            'name': 'str',
            'definition': 'str',
            'examples': 'list[str]'
        }

        self.attribute_map = {
            'name': 'name',
            'definition': 'definition',
            'examples': 'examples'
        }

        self._name = None
        self._definition = None
        self._examples = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this DeniedTopic.
        Name of the denied topic.


        :return: The name of this DeniedTopic.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this DeniedTopic.
        Name of the denied topic.


        :param name: The name of this DeniedTopic.
        :type: str
        """
        self._name = name

    @property
    def definition(self):
        """
        **[Required]** Gets the definition of this DeniedTopic.
        Definition of the denied topic.


        :return: The definition of this DeniedTopic.
        :rtype: str
        """
        return self._definition

    @definition.setter
    def definition(self, definition):
        """
        Sets the definition of this DeniedTopic.
        Definition of the denied topic.


        :param definition: The definition of this DeniedTopic.
        :type: str
        """
        self._definition = definition

    @property
    def examples(self):
        """
        Gets the examples of this DeniedTopic.
        Examples of content that would violate this topic.


        :return: The examples of this DeniedTopic.
        :rtype: list[str]
        """
        return self._examples

    @examples.setter
    def examples(self, examples):
        """
        Sets the examples of this DeniedTopic.
        Examples of content that would violate this topic.


        :param examples: The examples of this DeniedTopic.
        :type: list[str]
        """
        self._examples = examples

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
