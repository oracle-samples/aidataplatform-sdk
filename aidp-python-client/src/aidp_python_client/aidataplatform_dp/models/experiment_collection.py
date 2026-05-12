# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentCollection(object):
    """
    Result of listing Experiments.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiments:
            The value to assign to the experiments property of this ExperimentCollection.
        :type experiments: list[oci.aidataplatform_dp.models.Experiment]

        :param next_page_token:
            The value to assign to the next_page_token property of this ExperimentCollection.
        :type next_page_token: str

        """
        self.swagger_types = {
            'experiments': 'list[Experiment]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'experiments': 'experiments',
            'next_page_token': 'next_page_token'
        }

        self._experiments = None
        self._next_page_token = None

    @property
    def experiments(self):
        """
        **[Required]** Gets the experiments of this ExperimentCollection.
        Experiments that match the search criteria


        :return: The experiments of this ExperimentCollection.
        :rtype: list[oci.aidataplatform_dp.models.Experiment]
        """
        return self._experiments

    @experiments.setter
    def experiments(self, experiments):
        """
        Sets the experiments of this ExperimentCollection.
        Experiments that match the search criteria


        :param experiments: The experiments of this ExperimentCollection.
        :type: list[oci.aidataplatform_dp.models.Experiment]
        """
        self._experiments = experiments

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this ExperimentCollection.
        Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.


        :return: The next_page_token of this ExperimentCollection.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this ExperimentCollection.
        Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.


        :param next_page_token: The next_page_token of this ExperimentCollection.
        :type: str
        """
        self._next_page_token = next_page_token

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
