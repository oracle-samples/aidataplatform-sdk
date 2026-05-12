# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ModelParameterDetail(object):
    """
    The detail summary of each model parameter
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ModelParameterDetail object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param code_gen_name:
            The value to assign to the code_gen_name property of this ModelParameterDetail.
        :type code_gen_name: str

        :param name:
            The value to assign to the name property of this ModelParameterDetail.
        :type name: str

        :param description:
            The value to assign to the description property of this ModelParameterDetail.
        :type description: str

        """
        self.swagger_types = {
            'code_gen_name': 'str',
            'name': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'code_gen_name': 'codeGenName',
            'name': 'name',
            'description': 'description'
        }

        self._code_gen_name = None
        self._name = None
        self._description = None

    @property
    def code_gen_name(self):
        """
        Gets the code_gen_name of this ModelParameterDetail.
        Internal code-friendly name for the parameter


        :return: The code_gen_name of this ModelParameterDetail.
        :rtype: str
        """
        return self._code_gen_name

    @code_gen_name.setter
    def code_gen_name(self, code_gen_name):
        """
        Sets the code_gen_name of this ModelParameterDetail.
        Internal code-friendly name for the parameter


        :param code_gen_name: The code_gen_name of this ModelParameterDetail.
        :type: str
        """
        self._code_gen_name = code_gen_name

    @property
    def name(self):
        """
        Gets the name of this ModelParameterDetail.
        Human-readable name for the parameter


        :return: The name of this ModelParameterDetail.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this ModelParameterDetail.
        Human-readable name for the parameter


        :param name: The name of this ModelParameterDetail.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this ModelParameterDetail.
        Description of the parameter


        :return: The description of this ModelParameterDetail.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this ModelParameterDetail.
        Description of the parameter


        :param description: The description of this ModelParameterDetail.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
